import operator


def list_methods():
    l = [1, 2]
    print(l)
    l.insert(0, 4)  # (index, element)
    l.append(3)
    print(l)
    print(l * 2)
    print(l + [4, 5])
    del (l[0:1])  # delete by index or gap
    print(l)
    l.remove(2)  # delete by content
    print(l)
    ret = l.pop()  # is also possible to give an index
    print('il pop ha tornato e rimosso: ' + str(ret))
    print(l)
    l.clear()  # removes everythin
    print(l)
    l += [5, 4, 3, 2, 1]  # or extend
    print(l)
    l.sort()
    print(l)
    l.sort(reverse=True)  # there is also the param key that can sort by a lambda function
    print(l)

    # sort changes the original list (destructive), sorted() doesnt
    print('sorted: ' + str(sorted(l)))

    return


def basics():
    objects = [1, 2, 3, 'four', [5, 6, 7], 8]

    print(objects[-2])
    print(objects[-2][0])
    objects[0] = 2  # mutable

    # the first number is INCLUDED, the second one is EXCLUDED
    # this will print indexes: 0, 1
    print(objects[0:2])
    print(objects[:])  # this will print everything
    objects[0:2] = [1, 2]
    return


def comprehension():
    print('\nComprehension: \n')
    # this approach is valid for generators, lists, tuples, dics..
    # it just depends on the outer brackets: ( list approach with square brackets )

    comp_list = [' AnnDJD ', 'Nosmmsad ', ' AFmff']
    comp_list = [s.strip().lower() for s in comp_list]
    print(comp_list)

    return


def advanced_sorting():
    sorting_list = [['jack', 3], ['michael', 2], ['annie', 10], ['bob', 10]]
    print('\nThe list will be sorted by name automatically, because is the first element in the sublist')
    print(sorted(sorting_list))
    print(
        sorted(sorting_list, key=operator.itemgetter(1)))  # this will sort by the indexed element, so the index 1, here
    print(sorted(sorting_list,
                 key=operator.itemgetter(1, 0)))  # in this way if the name is the same, it will sort by the name

    return


def shallow_deep_copy():
    first_list = [1,2,(3,4,5), [10,11]]
    second_list = list(first_list)
    second_list[0]=3
    print(first_list)
    second_list[3].sort(reverse=True)
    print("""\nThe first list sublist gets modified also when edited from the second list reference, 
        this is because the sublists (also the tuple) references will be always linked with this kind of (shallow) copy\n""")
    print(first_list)
    print(second_list)

    print("This is why deepcopy exists: ")
    import copy
    first_list = [1,2,(3,4,5), [10,11]]
    second_list = copy.deepcopy(first_list)
    second_list[3].sort(reverse=True)
    print(first_list)
    print(second_list)

    return


def main_list():
    print('Lists M2')
    # PROPERTIES:
    # resizable array
    # mutable: yes  !!!
    # insertion order: yes
    # duplicates: yes
    # using plural as var name
    # they can contain many different types, also other lists

    # basics()
    # print('\n\n')
    # list_methods()
    # comprehension()
    advanced_sorting()
    shallow_deep_copy()

    return
