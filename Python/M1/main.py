# BASIS OF PYTHON

from flow import *
from func import *
from exceptions import *
from decorators import *
from file import *


def main(name):
    print(f'Hi, {name}')
    # null/void/undefined -> false, legit type -> true

    num = 2.3  # not needed a type declaration

    print(type(num))  # indeed he detects it by itself
    print(isinstance(num, int))

    # CASTING

    # in order to cast explicit. can be used:
    #       int(), float(), str(), bool()

    print(int(num))

    # STRING obj

    # Also python has an object-oriented approach, indeed there are methods (between these we can also
    #   find python private methods, marked with double underscore '__{method}__')
    #   i.e. to get the len of a string we can both use the method str.__len__() or call the function
    #   len(str) that just calls the __len__ method on the object itself.
    #   Obv. before the stdout print is needed a manual cast to string from integer.

    s = 'this is a sample string'
    print('\nMethod with len function: ' + str(len(s)))
    print('\nMethod with __len__ method: ' + str(s.__len__()))

    # Indexing in Python:   (JS-like)
    #       Standard indexing:  s[0]
    #       Negative indexing:  s[-1]
    #       Slicing; s[0:4]

    print(s[0:4])

    # Strings are immutable (JS-Like)
    # this: s[0]='a' is illegal

    s = '\n"s" string has been changed and collected by the g.collector'
    print(s)

    del s

    print('\nThe string "pointer" has been manually removed, indeed typeid(s) would output an error')

    # String comb.

    s1 = 'Hello'
    s2 = ' World'
    # Java-like method (slower, DOES NOT AUTOMATICALLY CAST TO str() )

    print(s1 + s2)

    # 'C'-like method (suggested, automatic casting)

    print("{}{}".format(s1, s2))

    # String formatting

    print("\nString Formatting: \n")

    #   explicit print order by format index
    print("{1} {0}".format(s1, s2))

    # every string will pad the given number, filling with blank spaces
    print("{:10} {:10}".format(s1, s2))

    # number precision
    print("{:.10f}".format(10 / 3))

    # How-To with newlines and spaces

    s = """
    lstrip-> removes spaces on left
    rstrip-> removes spaces on right
    strip-> removes spaces both left and right
           
    """
    print(s)
    print('"{}"'.format(s.strip()))

    # just for justify: (needs a parameter when called)
    #   ljust: left justify
    #   rjust; right justify
    #   center: center

    print('{}'.format(s.ljust(40)))

    # how to use IN:    (this cost. works also for lists, arr etc.. like every membership command)

    print('IN output:\n')
    print('u' in 'university')
    print('u' not in 'university')

    # other useful method can be, CSV-Like
    #       split()
    #       join()

    print("\n\n")
    print("\nOriginal: ")
    split_join_s = 'i will split, this sentence by commas, soon will be rejoined'
    print(split_join_s)
    returned_from_s = split_join_s.split(',')
    print("\nSplit: ")
    print(returned_from_s)
    returned_from_s = ",".join(returned_from_s)
    print('\nJoin: ')
    print(returned_from_s)


if __name__ == '__main__':
    # comment / uncomment what needed or not
    # main('mich')
    # main_flow()
    # main_func()
    # main_exept()
    # main_dec()
    main_file()
