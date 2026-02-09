def is_armstrong(number):
    num_str = str(number)
    power = len(num_str)
    return number == sum(int(digit) ** power for digit in num_str)

def main():
    num = int(input("Enter a number: "))
    print("Armstrong" if is_armstrong(num) else "Not Armstrong")

if __name__ == "__main__":
    main()
