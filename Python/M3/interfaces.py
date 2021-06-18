class InformalCarInterface:
    def speed_up(self):  # these methods must be overridden in specialized classes
        pass

    def speed_down(self):
        pass


class Car(InformalCarInterface):
    def __init__(self):
        pass

    def speed_up(self):
        # speed += 10
        pass

    def speed_down(self):
        # speed -= 10
        pass


def main_interfaces():
    return
