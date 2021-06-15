def division(n1, n2):  # try-except-else-finally
    r = -1
    try:
        r = n1 / n2
    except Exception as e:
        print(e)
    else:
        print('No exception detected!')
    finally:
        print('I will be executed anyways')
    return r


def main_exept():
    print('Exceptions Handling M1')
    print('\n')
    print(division(3, 1))
    return
