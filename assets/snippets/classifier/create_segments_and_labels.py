# Function to create segments and labels
def __create_segments_and_labels(self, df, label_name):

    # Settings
    SEGMENT_WIDTH = 80
    STEP = 40
    # Features = x, y, z, t
    # x, y, z, timestamp as features
    N_FEATURES = 4
    # Init
    segments = []
    labels = []
    # Generate
    for i in range(0, len(df) - SEGMENT_WIDTH, STEP):

        xs = df['x-axis'].values[i: i + SEGMENT_WIDTH]
        ys = df['y-axis'].values[i: i + SEGMENT_WIDTH]
        zs = df['z-axis'].values[i: i + SEGMENT_WIDTH]
        ts = df['timestamp'].values[i: i + SEGMENT_WIDTH]
        
        # Create segments
        segments.append([xs, ys, zs, ts])

        # Create labels
        current_labels = df[label_name][i: i + SEGMENT_WIDTH]
        # Retrieve the most often used label in this segment
        label = stats.mode(current_labels)[0][0]
        # and then
        labels.append(label)

    # Bring the segments into a better shape
    reshaped_segments 
        = np.asarray(segments, dtype= np.float32)
            .reshape(-1, SEGMENT_WIDTH, N_FEATURES)
    
    labels = np.asarray(labels)

    return reshaped_segments, labels