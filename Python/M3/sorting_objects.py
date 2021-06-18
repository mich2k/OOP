from classes import Car


def main_sorting():
    car_list = [
        Car('BMW', 'M3'),
        Car('Tesla', '3', 100)
    ]

    print(car_list)

    car_list.sort(key=lambda car: car.speed, reverse=True)

    import operator
    print(sorted(car_list, key=operator.attrgetter('speed', 'brand')))
    print(car_list)

    return
