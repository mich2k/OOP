from datetime import datetime


def f_in_f(*n):
    def second():
        print('Second')
        return

    def first():
        print('First')
        return

    if n.__len__() == 0 or not (isinstance(n[0], int)):
        first()
        second()
    else:
        if n[0] == 1:
            first()
        elif n[0] == 2:
            second()

    return


# PIE SYNTAX
def my_decorator(func):
    def wrapper():
        print('\n I m calling the function... ')
        func()
        print('\n Function called.')

    return wrapper


def not_during_the_night(func):
    def wrapper():
        print('Now is ' + str(datetime.now().hour) + ':' + str(datetime.now().minute))
        if 7 <= datetime.now().hour < 22:
            func()
        else:
            pass  # Hush, the neighbors are asleep

    return wrapper


def wrapper_with_param(func):  # wrapper function made as much general as possible
    def wrapper(*args, **kwargs):
        func(*args, **kwargs)

    return wrapper


def wrapper_param_return(func):  # final and most complete & general approach
    def wrapper(*args, **kwargs):
        return func(*args, **kwargs)

    return wrapper


@not_during_the_night
def hello_w():
    print('Hello World')
    return


@wrapper_with_param
def repeat(this):
    print(this)
    return


def repeat_and_return(this):
    print(this)
    return 'Done!'


def main_dec():
    print('Decorators M1')
    f_in_f()
    print('\n')
    f_in_f(1)
    print('\nDecorators with @ \'at\' ')
    hello_w()
    print('\nGeneral way with n-args and n-kvargs\n')
    repeat('Im the general one, but still without the return statement!')
    print(str(repeat_and_return('\nI have args and even return "Done!", breathtaking!')))
    return
