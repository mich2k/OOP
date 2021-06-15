def basics():
    tup = (1, 2, [3, 4, 'Five'], 'Six')
    print(tup)
    # what matters is the COMMA, this is the element that actually creates tuples
    # one element tuple how-to:

    print(type(('element',)))   # tuple
    print(type(('element')))    # str

    del tup
    return


def main_tuples():
    print('Tupels M2')
    # Mutable: No, but can contain mutable elements, like lists
    # insertion order: yes
    # duplicates: yes
    # we can mix also here different objects
    # tuples are usually used to store different data types in a single tuple
    # these are faster to process and iterate to
    # are also used as dictionary's key
    basics()
    return
