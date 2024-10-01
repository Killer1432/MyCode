def main():
    baskets = []

    A = "apple"
    O = "orange"
    M = "mango"
    G = "guava"

    print("Catch and eat any of these fruits: ('apple', 'orange', 'mango', 'guava')")
    catcher = int(input("How many fruits would you like to catch?: "))

    for x in range(1, catcher + 1):
        fruit = input(f"Fruit {x} of {catcher}: ").strip().lower()

        if fruit == 'a':
            baskets.append(A)
        elif fruit == 'o':
            baskets.append(O)
        elif fruit == 'm':
            baskets.append(M)
        elif fruit == 'g':
            baskets.append(G)
        else:
            print("Invalid fruit, try again.")
            continue  # Skip to the next iteration

        print("Your basket now has:", baskets)

    # Eating fruits
    while baskets:
        action = input("Press 'E' to eat a fruit or  you don't want to eat ").strip().lower()

        if action == 'e':
            eaten_fruit = baskets.pop()
            print("You are Eat a ", eaten_fruit + "!")
            print("Fruits in the Basket:", baskets)
        else:
            print("You don't want to eat.")

    print("No more fruits.")

if __name__ == "__main__":
    main()
