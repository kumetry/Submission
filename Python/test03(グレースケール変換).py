# 画像の入出力及びグレースケール変換
# coding:utf-8

# str文字列をunicodeで扱う
from __future__ import unicode_literals
# OpenCVの機能を使用する
import cv2

def main():
    # 画像の読み込み(フルカラー)
    # 最初からグレースケールで読み込むときは二つ目の引数を0にする
    img = cv2.imread("test01.jpg", 1)

    # 画像の有無をチェック
    if img is None:
        print "画像が存在しません"
        return 0

    # グレースケール変換
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

    # 画像の表示
    cv2.imshow("source", img)
    cv2.imshow("gray", gray)
    # キー入力待ち
    cv2.waitKey()
    # 全てのウインドウを閉じる
    cv2.destroyAllWindows()
    # 画像を出力
    # cv2.imwrite("gray.png", gray)

# おまじない
if __name__ == '__main__':
    main()
