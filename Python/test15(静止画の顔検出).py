#coding: utf-8

import cv2
import numpy as np

#分類機の読み込み（カスケード検出）
faceCascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

img = cv2.imread('lenna.png', cv2.IMREAD_COLOR)#画像の読み込み
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)#グレースケール
face = faceCascade.detectMultiScale(gray, 1.1, 3)#顔検出

#顔の部分を四角く描画

if len(face) > 0:
	for rect in face:
		cv2.rectangle(img, tuple(rect[0:2]), tuple(rect[0:2]+rect[2:4]), (0, 0,255), thickness=2)
else:
	print "no face"

#書き込み

cv2.imwrite('test001.jpg', img)

cv2.waitKey(0)
