import os
from datetime import datetime


def paths():
    curr_file = os.path.realpath('file.py')
    curr_dir = os.path.dirname(curr_file)
    # data_dir = os.path.join(current_dir, 'subdir_to_explore')
    print(curr_file + '\n' + curr_dir)
    # controls that can also be done on a OS-level exist also in python os.path module (read doc for futher info)
    # os.path.exists
    # os.path.isfile
    # os.path.isdir
    return


def manage_files():
    # the with command is suggested since will automatically close the file stream
    print('\n')
    path = os.path.join(os.path.dirname(os.path.realpath('file.py')), 'res/sample_file.inp')
    try:
        with open(path, 'r') as f:
            for line in f:
                print(line.strip())
        with open(path, 'a') as f:
            f.write('\nread on ' + str(datetime.now()))
    except FileNotFoundError as e:
        print('\nthe requested file: "' + path + '" can not be found')
    else:
        print('File found and printed to stdout.')

    return


def main_file():
    paths()
    manage_files()
    return
