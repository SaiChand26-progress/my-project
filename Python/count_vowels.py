def count_vowels(text):
    vowels = "aeiouAEIOU"
    return sum(1 for c in text if c in vowels)

def main():
    string = input("Enter a string: ")
    print("Number of vowels:", count_vowels(string))

if __name__ == "__main__":
    main()
