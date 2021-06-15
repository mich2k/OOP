def basis():
    print('\nFirst:')
    for i in range(3):  # min, max, step
        print(i, end=',')

    print('\nSecond:')
    for i in range(4, 7):
        print(i, end=',')

    print('\nThird:')
    for i in range(0, 10, 2):
        print(i, end=',')

    return


def generator_comprehension():
    print('\n\nGenerator Comprehension:')
    # ( <expression> for <var> in <iterable> [ if <condition> ]
    #       go through the list [0..32], select all legit items in the if statement and apply the expression i/2
    first_gen = (i / 2 for i in [0, 9, 21, 32] if i < 30)
    for item in first_gen:
        print(item)
    # sum, next, max, any, all ... methods

    # ACHTUNG: once used it must be re-created

    # on the fly methods

    print(any(i < 3 for i in [5, 6, 7, 8]))
    print(', '.join(str(i) for i in [1, 2, 3, 4, 5]))

    return


def main_generators():
    print('Generators M2')
    basis()
    generator_comprehension()

    return
