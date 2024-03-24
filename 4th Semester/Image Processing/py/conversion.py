from PIL import Image
import matplotlib.pyplot as plt
img = Image.open('../img/street-sign.jpg')

# Convert it to a grayscale image:
# L means grapscale mode，you can try RGB, F mode;
img_convert = img.convert('L')

# Tip: If having error in this line, you may need upgrade matplotlib like this:
# pip install matplotlib --upgrade

# Show the image
plt.imshow(img_convert)
plt.show()
