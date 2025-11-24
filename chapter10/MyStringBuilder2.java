class MyStringBuilder2 {

    private char[] store;
    private int count;

    public MyStringBuilder2() {
        store = new char[0];
        count = 0;
    }

    public MyStringBuilder2(char[] arr) {
        store = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            store[i] = arr[i];
        }
        count = arr.length;
    }

    public MyStringBuilder2(String text) {
        store = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            store[i] = text.charAt(i);
        }
        count = text.length();
    }

    private void expand(int needed) {
        int newCap = store.length == 0 ? needed : Math.max(store.length * 2, needed);
        char[] temp = new char[newCap];
        for (int i = 0; i < count; i++) {
            temp[i] = store[i];
        }
        store = temp;
    }

    public int length() {
        return count;
    }

    public MyStringBuilder2 substring(int start, int finish) {
        int newLen = finish - start;
        char[] sub = new char[newLen];
        for (int i = 0; i < newLen; i++) {
            sub[i] = store[start + i];
        }
        return new MyStringBuilder2(sub);
    }

    public MyStringBuilder2 substring(int start) {
        return substring(start, count);
    }

    public MyStringBuilder2 insert(int index, MyStringBuilder2 other) {
        int add = other.count;
        int needed = count + add;

        if (needed > store.length) {
            expand(needed);
        }

        for (int i = count - 1; i >= index; i--) {
            store[i + add] = store[i];
        }

        for (int i = 0; i < add; i++) {
            store[index + i] = other.store[i];
        }

        count += add;
        return this;
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0; i < count / 2; i++) {
            char tmp = store[i];
            store[i] = store[count - 1 - i];
            store[count - 1 - i] = tmp;
        }
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < count; i++) {
            store[i] = Character.toUpperCase(store[i]);
        }
        return this;
    }

    @Override
    public String toString() {
        return new String(store, 0, count);
    }
}