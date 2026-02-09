def is_palindrome(text):
    return text == text[::-1]  # Check if reversed string equals original

def main():
    word = input("Enter a string: ")
    if is_palindrome(word):
        print("Palindrome")
    else:
        print("Not Palindrome")

if __name__ == "__main__":
    main()
