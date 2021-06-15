def data_structures():
    # THESE ARE ITERABLE OBJECTS NOT ITERATORS !
    # these structures CAN PRODUCE an ITERATOR with the built in __iter__() method or iter() function
    # string
    # list
    # tuple
    # set
    # dictionary / map
    str = 'strings are iterable'
    num_list = [1, 2, 3]
    num_tuple = (1, 2, 3)  # not possible to edit this
    num_set = {1, 2, 3}
    map = {1: 'primo', 2: 'secondo', 3: 'terzo'}
    # all these structures can be processed through a for-loop statement
    print('set:')
    for elem in num_set:
        print(elem)
    print('hashmap/dictionary:')
    for k, v in map.items():
        print(k, v)
    return


def iterators():
    print('\n\n')
    my_set = {6, 2, 3, 4, 1, 99}
    print(my_set)
    my_iter = iter(my_set)  # Object iterator defined
    print(next(my_iter))
    print(next(my_iter))
    print(next(my_iter))
    print(next(my_iter))
    print(next(my_iter))
    print(next(my_iter))

    return


def iterable_functions():
    s = 'Im a string'
    l_true = [1, 2, 3]
    l = [1, 2, None]
    print(list(s))  # string -> list
    print(tuple(s))  # string -> tuple
    print(sorted(s))
    print(any(l))  # returns true if there is at least one bool(item) true
    print(all(l))  # returns true only if all the items return true on bool(item)
    print(all(l_true))
    print(max(l_true))  # max & min value
    print(min(l_true))

    return


def main_iter():
    print('Iterators M2')
    data_structures()
    iterators()
    iterable_functions()

    return
