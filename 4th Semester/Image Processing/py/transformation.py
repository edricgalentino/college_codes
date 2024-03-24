from PIL import Image
import matplotlib.pyplot as plt

# Open the image
img = Image.open('../img/street-sign.jpg')


# Crop the image to the region of interest
region = (100, 100, 700, 450)
cropImg = img.crop(region)
# Display the cropped image
print("Transformation type: Crop")
plt.imshow(cropImg)
plt.show()


# Rotate the image by 45 degrees
img_rotate = img.rotate(45)
# Display the rotated image
print("Transformation type: Rotate 45 degrees")
plt.imshow(img_rotate)
plt.show()


# ROTATE_90 means rotate 90 degree
img_rotate = img.transpose(Image.ROTATE_90)
# Display the rotated image
print("Transformation type: Rotate 90 degrees using transpose")
plt.imshow(img_rotate)
plt.show()


# Scale the image to 300*400 pixel size
img_resize = img.resize((400, 300))
# Display the resized image
print("Transformation type: Resize to 400*300")
plt.imshow(img_resize)
plt.show()


img_inst = img.split()[0].point(lambda p: p * 0.9)
# Display the transformed image
print("Transformation type: Change the intensity of the image")
plt.imshow(img_inst)
plt.show()


img_transformed = img.transform((400, 300), Image.AFFINE, (1, 0.5, 0, 0, 1, 0))
# Display the transformed image
print("Transformation type: Transform the image")
plt.imshow(img_transformed)
plt.show()
