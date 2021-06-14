def main_flow():
    if 2 > 3:
        print("if test")
    elif 2 == 3:
        print("elif")
    else:
        print("else statement structure")

    str = "for string that will be printed"

    for c in str:
        print(c, end=', ')
    else:
        print()
        print('End for')

    if 2 < 3:  # pass is a syntax to label something that WILL be implemented in future
        pass
