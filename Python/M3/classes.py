class Car:
    """
    this class creates a Car, maybe the most common example in the oop world
    is this the new 'Hello World!' ?
        , maybe yes.

    This will be printed with the class.__doc__ method
    """
    # class attributes, shared between all objects in the class

    engine = 1
    wheels = 4

    # constructor
    def __init__(self, brand, model, speed=0):  # __init__ is the costructor method, self attribute is mandatory
        # speed=0 defines the default value of speed if not given
        self.brand = brand
        self.model = model
        self.speed = speed

    # methods

    def speed_up(self, quantity):
        self.speed += quantity

    def speed_down(self, quantity):
        self.speed -= quantity

    # NOT THIS
    def print_car_info(self):
        print(f'\nbrand: {self.brand}\nmodel: {self.model}\nspeed: {self.speed}\nwheels: {self.__class__.wheels}')

    # BUT THIS

    # def __repr__(self):  # if __str__ is not defined it will just call __repr__ method
    #     return f'\nbrand: {self.brand}\nmodel: {self.model}\nspeed: {self.speed}\nwheels: {self.__class__.wheels}'

    # OR EVEN BETTER
    def __repr__(self):
        return str(self.__dict__)

    # this decorator doesnt allow the method to edit the class attributes,
    # its a safe/prevent decorator, often used with utility based methods

    @staticmethod
    def within_limits(self, max, min):
        return self.speed > max or self.speed < min

    @classmethod
    def from_file(cls, f):
        pass  # remove
        return  # remove
        brand, model, speed = f.readline().split(', ')
        return cls(brand, model, speed)

    # destructor

    def __del__(self):  # this is another built in method
        print(f'\nObject destroyed.')


def main_class():
    print('M3 Class')
    # from a class you can define many objects
    first_car = Car('BMW', 'M3', 100)
    print(repr(first_car))
    first_car.speed_up(10)
    first_car.__class__.wheels = 6
    print(first_car)

    del first_car  # this calls the __del__ method

    second_car = Car.from_file(None)

    print(Car.__doc__)




    return
