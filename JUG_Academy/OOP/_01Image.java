package JUG_Academy.OOP;

import java.io.Serializable;

public class _01Image {
    public static void main(String[] args) {
        Image image = new Image(10, 15, "123".getBytes());
        System.out.println(image.getWidth());
        System.out.println(image.getHeight());
        System.out.println(image.getContent());
    }

    public static class Image implements Serializable {
        public int width;
        public int height;
        public byte[] content;

        public Image(int width, int height, byte[] content) {
            this.width = width;
            this.height = height;
            this.content = content;
        }

        public Image() {
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public byte[] getContent() {
            return content;
        }

        public void setContent(byte[] content) {
            this.content = content;
        }

        public void scale(int factor) {
        }

        public static class Builder extends Image {

            public Builder(int width, int height, byte[] content) {
                super(width, height, content);
            }

            public Builder() {
            }

            public int width(int width) {
                return width;
            }

            public int height(int height) {
                return height;
            }

            public byte[] content() {
                return content;
            }

            public Image build() {
                return new Image(this.width, this.height, this.content);
            }

        }


    }
}
