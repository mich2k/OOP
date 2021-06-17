def oop_methods():
    a = [1, 2]
    b = [1, 2]
    #class b = a
    # this prints the references
    print(id(a))
    print(id(b))
    if a == b:
        print(
            '\na and b (lists) have the same contents, but may be different objects with different ids')  # JAVA-opposite
        if (a is b):
            print('actually they are different labels for the same object')
    else:
        print('content differs')
    return


def main_oop():
    print("M3 OOP basis")
    oop_methods()
    return
