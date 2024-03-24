# from PIL import Image
import matplotlib.pyplot as plt

# Use OpenCV here
import cv2
img = cv2.imread('../img/testprofilepict.png')

# Tip: pip install opencv-python

# Convert RGB color image to gray scale image
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

##
plt.figure()
plt.subplot(1, 2, 1)
plt.imshow(img, cmap=plt.cm.gray)
plt.subplot(1, 2, 2)

# Histogram
print(plt.hist(img.ravel(), 256, [0, 256]))
