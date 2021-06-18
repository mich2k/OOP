# base class
class Car:
    def __init__(self, brand, model, speed=0):
        self.brand = brand
        self.model = model
        self.speed = speed

    def speed_up(self):
        self.speed += 1

    def speed_down(self):
        self.speed -= 1

    def __repr__(self):
        return str(self.__dict__)


# derived class (multi-derived classes exist too)
class ECar(Car):
    # he grabs the same attributes from the parent class but we can add more, or edit defaults..
    def __init__(self, brand, model, speed=0, battery_level=0):
        super().__init__(brand, model, speed)  # we call the constructor of the parent
        self.battery_level = battery_level  # instead here we find the specialized attributes

    # overridden method (speed_down is taken from parent), polymorfism !!!!
    def speed_up(self):
        self.speed += 2

    # additional methods
    def charge(self):
        self.battery_level += 1

    def discharge(self):
        self.battery_level -= 1


def main_inheritance_polym():
    cars = [Car('BMW', 'M3', 20), ECar('Tesla', 'ModelX', 30)]
    for car in cars:
        car.speed_up()

    tesla = ECar('Tesla', 'ModelX')
    print(tesla)
    print('\n\n')
    print(cars)
