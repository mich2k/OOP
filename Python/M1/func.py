def assignment_list(l):
    print('Before processing list: {}'.format(l))
    l = [8, 9]
    print('After processing list: {}'.format(l))
    return


def ext_list(l):  # objects are passed by reference, but same rules are applied:
    # if the function calls a new assignment like l=[1,2] this
    # reference will live only inside the function
    print('Before processing list: {}'.format(l))
    l.extend([4, 5])
    print('After processing list: {}'.format(l))
    return


def default_f(name, msg=" is my name"):
    print(name + msg)
    return


def undefined_arg_number(*args):
    i = 0
    for a in args:
        print('Index ' + str(i) + ': ' + a)
        i += 1
    return

def key_value(**kwargs):
    i = 0
    for k, v in kwargs.items():
        print('{} = {} '.format(k,v))
        i += 1
    return




def main_func():
    l = [1, 2, 3]
    print('\nExtend list by reference:')
    ext_list(l)
    print('\nAssignment: ')
    assignment_list(l)
    print('\nlist in main after assignment: {}'.format(l))
    # default args (this is the Java method overloading made simple)
    default_f('John')
    default_f(name='John', msg=' is not my name')
    print('\n\n')
    undefined_arg_number('primo', 'secondo', 'terzo', 'quarto')
    print('\nKey-Value: \n')
    key_value( elem1=1, kwarg2=2,kwarg3=3,elem4=4)


