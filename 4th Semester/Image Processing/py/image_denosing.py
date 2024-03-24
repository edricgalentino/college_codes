### read a image then display it###
from PIL import Image, ImageFilter
import matplotlib.pyplot as plt

# Open the image
img_noise = Image.open('../img/street-sign_noise.jpg')

##
plt.figure()
plt.subplot(1, 2, 1)
plt.imshow(img_noise)
plt.subplot(1, 2, 2)

# MedianFilter, to remove noise
img_filter = img_noise.filter(ImageFilter.MedianFilter(5))

##
plt.imshow(img_filter)
plt.show()
