from PIL import Image
import requests
from io import BytesIO
import matplotlib.pyplot as plt

# Save an image. ##
# Open the image.
img = Image.open(BytesIO(requests.get(
    'https://avatars.githubusercontent.com/u/83328527?v=4').content))

# Save the image.
img.save('../img/edricprofilegithub2.png')


# Or, we can open it now.
img = Image.open('../img/edricprofilegithub.png')
plt.imshow(img)
plt.show()
