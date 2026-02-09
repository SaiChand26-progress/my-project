def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def main():
    num = int(input("Enter a number: "))
    print("Factorial:", factorial(num))

if __name__ == "__main__":
    main()
