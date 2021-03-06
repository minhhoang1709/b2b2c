PGDMP     %                    w            b2b2c    11.2    11.2 *    3           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            4           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            5           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            6           1262    16494    b2b2c    DATABASE     �   CREATE DATABASE b2b2c WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE b2b2c;
             postgres    false            �            1259    16543    tblcart    TABLE     =  CREATE TABLE public.tblcart (
    cart_item_id integer NOT NULL,
    cart_order_id integer NOT NULL,
    cart_paint_id integer,
    cart_paint_name character varying(100),
    cart_paint_quantity integer,
    cart_coupon_id integer,
    cart_coupon_title character varying(100),
    cart_paint_final_price integer
);
    DROP TABLE public.tblcart;
       public         postgres    false            �            1259    16541    tblcart_cart_item_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tblcart_cart_item_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.tblcart_cart_item_id_seq;
       public       postgres    false    204            7           0    0    tblcart_cart_item_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.tblcart_cart_item_id_seq OWNED BY public.tblcart.cart_item_id;
            public       postgres    false    203            �            1259    16551 	   tblcoupon    TABLE     �  CREATE TABLE public.tblcoupon (
    coupon_id integer NOT NULL,
    coupon_code character varying(50),
    coupon_title character varying(100),
    coupon_subtitle text,
    coupon_description text,
    coupon_paint_id integer,
    coupon_discount_percent double precision,
    coupon_started_date character varying(50),
    coupon_exprired_date character varying(50),
    coupon_product_count integer,
    coupon_is_invite boolean,
    coupon_status boolean
);
    DROP TABLE public.tblcoupon;
       public         postgres    false            �            1259    16549    tblcoupon_coupon_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tblcoupon_coupon_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.tblcoupon_coupon_id_seq;
       public       postgres    false    206            8           0    0    tblcoupon_coupon_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.tblcoupon_coupon_id_seq OWNED BY public.tblcoupon.coupon_id;
            public       postgres    false    205            �            1259    16532    tblorder    TABLE     �  CREATE TABLE public.tblorder (
    order_id integer NOT NULL,
    order_user_id integer NOT NULL,
    order_created_date character varying(50),
    order_total integer,
    order_delivery_address character varying(200),
    order_customer_fullname character varying(100),
    order_customer_phone character varying(50),
    order_notes text,
    order_status boolean,
    order_ordered_date character varying(50)
);
    DROP TABLE public.tblorder;
       public         postgres    false            �            1259    16530    tblorder_order_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tblorder_order_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.tblorder_order_id_seq;
       public       postgres    false    202            9           0    0    tblorder_order_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.tblorder_order_id_seq OWNED BY public.tblorder.order_id;
            public       postgres    false    201            �            1259    16508    tblpaint    TABLE     <  CREATE TABLE public.tblpaint (
    paint_id integer NOT NULL,
    paint_name character varying(100) NOT NULL,
    paint_brand character varying(50),
    paint_color_code character varying(50),
    paint_weight character varying(50),
    paint_price integer,
    paint_count integer,
    paint_supplier_id integer
);
    DROP TABLE public.tblpaint;
       public         postgres    false            �            1259    16506    tblpaint_paint_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tblpaint_paint_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.tblpaint_paint_id_seq;
       public       postgres    false    199            :           0    0    tblpaint_paint_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.tblpaint_paint_id_seq OWNED BY public.tblpaint.paint_id;
            public       postgres    false    198            �            1259    16497    tbluser    TABLE     ]  CREATE TABLE public.tbluser (
    user_id integer NOT NULL,
    user_name character varying(50) NOT NULL,
    user_pass character varying(50),
    user_fullname character varying(50),
    user_address character varying(200),
    user_email character varying(100),
    user_phone character varying(50),
    user_created_date character varying(50)
);
    DROP TABLE public.tbluser;
       public         postgres    false            �            1259    16495    tbluser_user_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbluser_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.tbluser_user_id_seq;
       public       postgres    false    197            ;           0    0    tbluser_user_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.tbluser_user_id_seq OWNED BY public.tbluser.user_id;
            public       postgres    false    196            �            1259    16525    tblusercoupon    TABLE       CREATE TABLE public.tblusercoupon (
    user_id integer NOT NULL,
    usercoupon_code character varying(50) NOT NULL,
    coupon_id integer NOT NULL,
    coupon_started_date character varying(50),
    coupon_exprired_date character varying(50),
    coupon_product_count integer
);
 !   DROP TABLE public.tblusercoupon;
       public         postgres    false            �
           2604    16546    tblcart cart_item_id    DEFAULT     |   ALTER TABLE ONLY public.tblcart ALTER COLUMN cart_item_id SET DEFAULT nextval('public.tblcart_cart_item_id_seq'::regclass);
 C   ALTER TABLE public.tblcart ALTER COLUMN cart_item_id DROP DEFAULT;
       public       postgres    false    203    204    204            �
           2604    16554    tblcoupon coupon_id    DEFAULT     z   ALTER TABLE ONLY public.tblcoupon ALTER COLUMN coupon_id SET DEFAULT nextval('public.tblcoupon_coupon_id_seq'::regclass);
 B   ALTER TABLE public.tblcoupon ALTER COLUMN coupon_id DROP DEFAULT;
       public       postgres    false    206    205    206            �
           2604    16535    tblorder order_id    DEFAULT     v   ALTER TABLE ONLY public.tblorder ALTER COLUMN order_id SET DEFAULT nextval('public.tblorder_order_id_seq'::regclass);
 @   ALTER TABLE public.tblorder ALTER COLUMN order_id DROP DEFAULT;
       public       postgres    false    201    202    202            �
           2604    16511    tblpaint paint_id    DEFAULT     v   ALTER TABLE ONLY public.tblpaint ALTER COLUMN paint_id SET DEFAULT nextval('public.tblpaint_paint_id_seq'::regclass);
 @   ALTER TABLE public.tblpaint ALTER COLUMN paint_id DROP DEFAULT;
       public       postgres    false    199    198    199            �
           2604    16500    tbluser user_id    DEFAULT     r   ALTER TABLE ONLY public.tbluser ALTER COLUMN user_id SET DEFAULT nextval('public.tbluser_user_id_seq'::regclass);
 >   ALTER TABLE public.tbluser ALTER COLUMN user_id DROP DEFAULT;
       public       postgres    false    196    197    197            .          0    16543    tblcart 
   TABLE DATA               �   COPY public.tblcart (cart_item_id, cart_order_id, cart_paint_id, cart_paint_name, cart_paint_quantity, cart_coupon_id, cart_coupon_title, cart_paint_final_price) FROM stdin;
    public       postgres    false    204   �3       0          0    16551 	   tblcoupon 
   TABLE DATA               �   COPY public.tblcoupon (coupon_id, coupon_code, coupon_title, coupon_subtitle, coupon_description, coupon_paint_id, coupon_discount_percent, coupon_started_date, coupon_exprired_date, coupon_product_count, coupon_is_invite, coupon_status) FROM stdin;
    public       postgres    false    206   84       ,          0    16532    tblorder 
   TABLE DATA               �   COPY public.tblorder (order_id, order_user_id, order_created_date, order_total, order_delivery_address, order_customer_fullname, order_customer_phone, order_notes, order_status, order_ordered_date) FROM stdin;
    public       postgres    false    202   H6       )          0    16508    tblpaint 
   TABLE DATA               �   COPY public.tblpaint (paint_id, paint_name, paint_brand, paint_color_code, paint_weight, paint_price, paint_count, paint_supplier_id) FROM stdin;
    public       postgres    false    199   �6       '          0    16497    tbluser 
   TABLE DATA               �   COPY public.tbluser (user_id, user_name, user_pass, user_fullname, user_address, user_email, user_phone, user_created_date) FROM stdin;
    public       postgres    false    197   8       *          0    16525    tblusercoupon 
   TABLE DATA               �   COPY public.tblusercoupon (user_id, usercoupon_code, coupon_id, coupon_started_date, coupon_exprired_date, coupon_product_count) FROM stdin;
    public       postgres    false    200   39       <           0    0    tblcart_cart_item_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.tblcart_cart_item_id_seq', 17, true);
            public       postgres    false    203            =           0    0    tblcoupon_coupon_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.tblcoupon_coupon_id_seq', 5, true);
            public       postgres    false    205            >           0    0    tblorder_order_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tblorder_order_id_seq', 6, true);
            public       postgres    false    201            ?           0    0    tblpaint_paint_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tblpaint_paint_id_seq', 5, true);
            public       postgres    false    198            @           0    0    tbluser_user_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.tbluser_user_id_seq', 2, true);
            public       postgres    false    196            �
           2606    16548    tblcart tblcart_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.tblcart
    ADD CONSTRAINT tblcart_pkey PRIMARY KEY (cart_item_id);
 >   ALTER TABLE ONLY public.tblcart DROP CONSTRAINT tblcart_pkey;
       public         postgres    false    204            �
           2606    16559    tblcoupon tblcoupon_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.tblcoupon
    ADD CONSTRAINT tblcoupon_pkey PRIMARY KEY (coupon_id);
 B   ALTER TABLE ONLY public.tblcoupon DROP CONSTRAINT tblcoupon_pkey;
       public         postgres    false    206            �
           2606    16540    tblorder tblorder_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.tblorder
    ADD CONSTRAINT tblorder_pkey PRIMARY KEY (order_id);
 @   ALTER TABLE ONLY public.tblorder DROP CONSTRAINT tblorder_pkey;
       public         postgres    false    202            �
           2606    16513    tblpaint tblpaint_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.tblpaint
    ADD CONSTRAINT tblpaint_pkey PRIMARY KEY (paint_id);
 @   ALTER TABLE ONLY public.tblpaint DROP CONSTRAINT tblpaint_pkey;
       public         postgres    false    199            �
           2606    16505    tbluser tbluser_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.tbluser
    ADD CONSTRAINT tbluser_pkey PRIMARY KEY (user_id);
 >   ALTER TABLE ONLY public.tbluser DROP CONSTRAINT tbluser_pkey;
       public         postgres    false    197            �
           2606    16529     tblusercoupon tblusercoupon_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.tblusercoupon
    ADD CONSTRAINT tblusercoupon_pkey PRIMARY KEY (user_id);
 J   ALTER TABLE ONLY public.tblusercoupon DROP CONSTRAINT tblusercoupon_pkey;
       public         postgres    false    200            .   [   x�P ��17	6	0	Sơn Nội Thất Dulux EasyClean \nLau Chùi Hiệu Quả	1	5	\N	0
\.


�-�      0      x�u�Ak�0��ʧx��F*�q:]�4���H
=��x]lf+�e;�4�N;�2�	;t�e���}L��C�dOR�%k��,�����$�����ղۤ�0�E�H1��%��")^���々�`w}C/����a��S��.�������0%ɵ$S��*��no���ޡ���^������~�"ujr�Uԋ��;9��.D}�X�o Տ\.V�$�De*��ρE�^��$H!��2Q-C`�:�/C��6�Aa!���� �s�����;�od���PTשF�J-10��K�]��hQ=4HN�q;mj={��&d���<`0b�2��*���ֳ��efٽc�(���6��j|	�$�[ff�E�iI��3�}FaG�G�;j���pP���o�q�۷���w��Mw�p������x�s눶��؏���Z�^o�G]�'?�j��/�^�þ��~N:n��|��$�۰�n6�mmm�O�\?k �� F�F���Sk      ,   �   x�3�4�42�70�720��4�tz�k}�B��ݫ|2���Q�8�@����aGW*�f�e(x�^���i`lli`lfff��Ǚ�d�	��F����T3��xs��T3��xC3SKʌ/\1z\\\ ��r�      )   !  x����J�0���S|O0�fY��uE��^v�5m1k��	�z�8� ��M�'{�����NT� ��~��o��*�Û+Ne��O,�K	]>r8�u��7/
<��W���/4�3��I�,���4�U�F;���]>�>t���~�`&��980Cd����t��1�F�C6�1M�<�����
oּ�r�t���.������}��?�S��o���.Wu�t�&�r��%�X�Up+�d4��"�9�0Mn�",�;�i���KȾ�Y�0�O����      '     x�U��JA�뽧�q��n��D�+b�p����΢7w`����X�EQ	��Z�=�Mܨ������F��bmȊ�f"�Y������=�_�eGa�>�2to0r���A�0݃c۬�zph+��Ӻb\JͥR*c<?Hy,����5X;�nyE�na���#�'�=N��	J��ED~D��6�W��b��ѯ~m���d�h�뢇�\�T�Hv�f�Q�r�5�v���vc�ǜD�g����M�6��3J��hZ��晒*��]��$����      *   *   x�3�t	�	�02��4�42�70�720��4��3�b���� ���     