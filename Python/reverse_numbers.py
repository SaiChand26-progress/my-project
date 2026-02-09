# Function to reverse a number
def reverse_number(number):
    reversed_num = 0

    while number > 0:
        digit = number % 10          # Get last digit
        reversed_num = reversed_num * 10 + digit
        number //= 10                # Remove last digit

    return reversed_num

# Main function for input/output
def main():
    num = int(input("Enter a number: "))
    result = reverse_number(num)
    print("Reversed number:", result)

# Only run main if file is executed directly
if __name__ == "__main__":
    main()
