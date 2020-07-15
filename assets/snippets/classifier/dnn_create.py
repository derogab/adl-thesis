# Create neural network
my_model = Sequential()
my_model.add(Dense(100, activation='relu')) # Layer 1
my_model.add(Dense(100, activation='relu')) # Layer 2
my_model.add(Dense(100, activation='relu')) # Layer 3
my_model.add(Dense(100, activation='relu')) # Layer 4
my_model.add(Flatten())
my_model.add(Dense(num_classes, activation='softmax'))