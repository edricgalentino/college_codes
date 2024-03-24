from PIL import Image
import matplotlib.pyplot as plt

img = Image.open('../img/street-sign.jpg')

WHITE, BLACK = 255, 0   # define gray constant value

# judge each pixel
img_point = img.point(lambda x: WHITE if x > 128 else BLACK)

img_binary = img_point.convert('1')  # convert to binary image

# Show the image
plt.imshow(img)
plt.show()
plt.imshow(img_point)
plt.show()
plt.imshow(img_binary)
plt.show()
