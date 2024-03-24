##
from PIL import Image
import matplotlib.pyplot as plt

# Use OpenCV here
import cv2
img = cv2.imread('../img/street-sign.jpg')

# Tip: pip install opencv-python

# Convert RGB color image to gray scale image
img_filter_grayscale = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
# Convert RGB color image to hsv image
img_filter_hsv = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)

plt.imshow(Image.open('../img/street-sign.jpg'))
plt.show()

plt.imshow(img_filter_grayscale, cmap=plt.cm.gray)
plt.show()

plt.imshow(img_filter_hsv)
plt.show()
