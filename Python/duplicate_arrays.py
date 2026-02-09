def find_duplicates(arr):
    duplicates = set()
    seen = set()
    for num in arr:
        if num in seen:
            duplicates.add(num)
        else:
            seen.add(num)
    return duplicates

def main():
    numbers = list(map(int, input("Enter numbers separated by space: ").split()))
    print("Duplicates:", find_duplicates(numbers))

if __name__ == "__main__":
    main()
