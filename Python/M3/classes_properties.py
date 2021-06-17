class Owner:
    # the traditional java-like way is not possible in python, since it would break his
    # standard interface, instead:

    # FOR THIS TASK PYCHARM HAS THE 'prop' & 'props' & 'propsd' TEMPLATES! (still not auto-gen like intelliJ)

    def __init__(self, id, name='Unknown'):  # with the '_' conv. we define these vars "private"
        self.name = name
        self.id = id  # no '_' needed here

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, value):
        # getter or setter is called
        # returns the HIDDEN attribute
        if not (str(value).isnumeric()):        # i add a custom check in the setter that ID is only numeric
            raise ValueError('ID must be numeric')
        self._id = value

    @id.deleter
    def id(self):
        del self._id

    def __repr__(self):
        return str(self.__dict__)

    def __del__(self):
        del self


def main_properties():
    print('M3 Class Properties')
    owner1 = Owner(0, 'Mike')
    print(owner1)
    del owner1

    return
