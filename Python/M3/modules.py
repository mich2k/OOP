
# from res.car import Car, ECar

import res.car as c
import res.multiplying as m

# from res.car import * AVOID THIS

# modules must be short and lowercase
# class names must be in PascalCase


def main_modules():
    c0 = c.Car('BMW', 'M4')
    print(c0)
    print(m.double(2))

    return