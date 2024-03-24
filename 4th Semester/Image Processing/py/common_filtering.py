from PIL import Image, ImageFilter
import matplotlib.pyplot as plt

img = Image.open('../img/street-sign.jpg')

# EMBOSS filter
img_filter = img.filter(ImageFilter.EMBOSS)
plt.imshow(img_filter)
plt.show()


# EDGE_ENHANCE filter
img_filter = img.filter(ImageFilter.EDGE_ENHANCE)
plt.imshow(img_filter)
plt.show()


# CONTOUR filter
img_filter = img.filter(ImageFilter.CONTOUR)
plt.imshow(img_filter)
plt.show()


# SHARPEN
img_filter = img.filter(ImageFilter.SHARPEN)
plt.imshow(img_filter)
plt.show()

# BLUR
img_filter = img.filter(ImageFilter.BLUR)
plt.imshow(img_filter)
plt.show()
