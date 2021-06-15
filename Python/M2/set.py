def basics():
    print(type({}))  # {} is also the operator for dics, indeed this will print out dictionary
    print(type({1}))
    my_set = {1}
    my_set.add(2)
    my_set.update([2, 4, 5])    # the 2 is already in the set, it will guarantee the uniqueness indeed
    print(my_set)
    my_set.discard(2)   # if there isnt the element given it will just return NoNe
    try:
        my_set.remove(2) # remove will return an error if not present
    except KeyError as e:
        print('the set remove method returned an error indeed')


    # sets fits very well operations on ensembles (union, intersection, difference and symmetric difference)

    # frozen sets are immutable, hence can be used like dic keys
    my_frozen_set = frozenset([1,2,3])

    return


def main_set():
    print('Set M2')
    # they need immutable elements inside them
    # insertion order: not respected
    # the 'in' (membership) operator is way faster on sets, because is O(1)
    # immutable !
    # allow dups: NO
    basics()
    return
