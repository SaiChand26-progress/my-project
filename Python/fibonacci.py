def fibonacci_series(n):
    a, b = 0, 1
    series = []

    for _ in range(n):
        series.append(a)
        a, b = b, a + b  # Next number

    return series

def main():
    limit = int(input("Enter number of terms: "))
    print("Fibonacci Series:", fibonacci_series(limit))

if __name__ == "__main__":
    main()
