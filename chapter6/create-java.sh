#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Usage: ./create-java.sh ClassName"
    exit 1
fi

CLASS_NAME=$1
FILE_NAME="${CLASS_NAME}.java"

cat > "$FILE_NAME" << EOF
import java.util.Scanner;

public class $CLASS_NAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Your code here
        
    }
}
EOF

echo "Created $FILE_NAME with class $CLASS_NAME"
