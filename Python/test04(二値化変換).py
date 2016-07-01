#!/usr/bin/env python
#coding:utf-8

# 画像を2値化処理する

# 各種モジュールのimport
from __future__ import unicode_literals
import cv2

def main():
    # 画像をフルカラーで読み込む
    img2 = cv2.imread("test02.jpg", 1)
    # 画像をグレースケールで読み込む
    img = cv2.imread("test02.jpg", 0)

    # 画像の読み込みチェック
    if img is None:
        print "画像の読み込みに失敗しました。"
        return 0

    # 閾値(100)以下の値は0に、それ以外は255になるよう2値化処理
    bin_img1 = cv2.threshold(img, 100, 255, cv2.THRESH_BINARY)[1]

    # 判別分析法による2値化処理
    th, bin_img2 = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)
    print "判別分析法による閾値："+str(th)

    # 閾値を求める必要がない場合
    # bin_img2 = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)[1]

    # 画像の表示
    cv2.imshow("test", img2)
    cv2.imshow("test2", img)
    cv2.imshow("binarized", bin_img1)
    cv2.imshow("otsu", bin_img2)

    # キー入力待ち
    cv2.waitKey()

    # 全てのウインドウを閉じる
    cv2.destroyAllWindows()

if __name__ == '__main__':
    main()
