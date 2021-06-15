def basis():
    my_dict = [
        {'name': 'Jack', 'age': 26},
        {'name': 'John', 'age': 21}
    ]
    print(my_dict[0].get('name'))  # this will return NoNe
    print(my_dict[0]['name'])  # this will raise an error
    my_dict[0]['Address'] = '5 Avenue'  # since doesnt exist it just gets added
    print(my_dict[0])

    single_dic = {'engine': 1500, 'model': 'Ferrari', 'name': 'Enzo'}
    print(single_dic)

    print('\nvalues: ')
    for value in single_dic.values():
        print(value)
    print('\nkeys: ')
    for key in single_dic.keys():
        print(key)
    print('\nvalues + keys: ')
    for v, k in single_dic.items():
        print('{} {}'.format(v, k))
    print('\n\n')

    ret = single_dic.pop('engine')  # removes given key or last key if not given and returns it (stack-logic)
    print(single_dic)
    del single_dic['model']
    print(single_dic)
    del single_dic
    return


def unpacking():    # the zip() is the OPPOSITE of UNPACKING
    print('\nUnpacking: \n\n')
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

    return


def how_enumerate():    # enumerates work with all kind of iterables
    mlist = ['primo', 'secondo', 'terzo']
    e = enumerate(mlist)
    # enumerate transforms a given iterable in to a set of tuples
    # with the shifted index at beginning
    print(list(e))  # cast to list
    return


def main_dictionary():
    print('Dictionaries M2')
    # basis()
    # unpacking()
    how_enumerate()
    return
