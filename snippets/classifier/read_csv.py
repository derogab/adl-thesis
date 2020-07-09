# Name the columns of the file
column_names_list = ['archive',
                     'index',
                     'x-axis',
                     'y-axis',
                     'z-axis',
                     'timestamp',
                     'phone-position',
                     'activity']

# Read the file
df = pd.read_csv(file_path, header=None, names=column_names_list)