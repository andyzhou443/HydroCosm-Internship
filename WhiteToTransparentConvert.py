
'''
from simpleimage import SimpleImage

def WhiteToTransparent (image):
    img = SimpleImage(image)
    for pixel in img:
        if pixel.red = 0 and pixel.green = 0 and pixel.blue = 0:
            img.set_pixel()
    return img

def main():
    image = input("Enter Image File Name: ")
    WhiteToTransparent(image)
'''

from PIL import image

def WhiteToTransparent (image):
    with Image.open("image") as image:
        rgb_Image = image.convert('RGBA')
        for pixel in Image: 
            r, g, b, a = rgb_im.getpixel((1, 1))
            if r = 0 and g = 0 and b = 0:

        Image.save("transparent.PNG", "PNG", transparency= 0)
            
            

def main():
    image = input("Enter Image File Name: ")
    WhiteToTransparent(image)