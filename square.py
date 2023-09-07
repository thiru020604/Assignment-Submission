# Define the area function
def area(side_length):
    return side_length ** 2

# Input: Get the side length of the square from the user
try:
    side_length = float(input("Enter the side length of the square: "))
    
    # Calculate the area using the area() function
    square_area = area(side_length)
    
    # Output: Display the calculated area
    print(f"The area of the square with side length {side_length} is {square_area}")
except ValueError:
    print("Invalid input. Please enter a valid numeric value for the side length.")
