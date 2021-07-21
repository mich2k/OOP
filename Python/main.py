def main():
    my_dict = [
        {1: 'primo'},
        {2: 'secondo'}
    ]


    for e in my_dict:
        print(f"{e}")
    my_dict = [
        {'engine': 1500, 'model': 'Ferrari', 'name': 'Enzo'},
        {'engine': 1900, 'model': 'Fiat', 'name': 'Tipo'}
    ]
    # printing in a for loop these elements wont print the element itself but the associated tuple, indeed:

    print('\nWithout:\n')
    for element in my_dict:
        print(element)

    print('\nWith:\n')

    for i in range(0, len(my_dict)):
        print(f'\nindex {i}')
        for keys, values in my_dict[i].items():
            print(f'{keys} - {values}')



if __name__ == '__main__':
    main()
