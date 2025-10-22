#!/bin/bash
if [ $# -eq 0 ]; then
    echo "Usage: ./create-java.sh ClassName"
    exit 1
fi
CLASS_NAME=$1
TARGET_DIR=${2:-.}
FILE_NAME="${CLASS_NAME}.java"

mkdir -p "$TARGET_DIR"

cat > "${TARGET_DIR}/${FILE_NAME}" << EOF
import java.util.Scanner;

public class $CLASS_NAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
EOF

echo "Created ${TARGET_DIR}/${FILE_NAME} with class $CLASS_NAME"
