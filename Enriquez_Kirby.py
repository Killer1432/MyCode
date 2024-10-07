from collections import deque

# Create queues for movies and snacks
movies = deque()
snacks = deque()

# Get movie input
print("Enter three movies you'd like to watch:")
for i in range(1, 4):
    movie = input(f"Movie {i} of 3: ")
    movies.append(movie)

# Get snack input
print("Enter three snacks or beverages:")
for i in range(1, 4):
    snack = input(f"Snack {i} of 3: ")
    snacks.append(snack)

# Display movies and snacks
print("\nMovies you will watch:")
for movie in movies:
    print(movie + ",")

print("\nSnacks you have:")
for snack in snacks:
    print(snack + ",")

# Process snack consumption
while snacks:
    input("\nPress 'S' when you've finished a snack: ")
    snacks.popleft()  # Removes the first snack
    if not snacks:
        print("No more snacks.")
    else:
        print(f"Remaining snacks: {list(snacks)}")
