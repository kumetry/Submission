# coding: utf-8
import cv2
import math
import numpy as np

file_src = 'src.png'
file_dst = 'dst.png'

#file_src = 画像ファイル
img_src = cv2.imread('test01.jpg', 1)

cv2.namedWindow('src')
cv2.namedWindow('dst')

#ここに核となる処理を記述
img_dst = cv2.flip(img_src, flipCode = 0);#垂直反転

cv2.imshow('src', img_src)#入力画像を表示
cv2.imshow('dst', img_dst)#出力画像を表示
cv2.waitKey(0)
cv2.destroyAllWindows()
