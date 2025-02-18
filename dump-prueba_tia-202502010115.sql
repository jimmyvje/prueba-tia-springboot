PGDMP     %                    }         
   prueba_tia    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    24781 
   prueba_tia    DATABASE     f   CREATE DATABASE prueba_tia WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE prueba_tia;
                postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                postgres    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   postgres    false    3            �            1259    24784    producto    TABLE     �  CREATE TABLE public.producto (
    id integer NOT NULL,
    codigo character varying(20),
    descripcion character varying(100),
    marca character varying(100),
    precio_compra double precision NOT NULL,
    pvp double precision NOT NULL,
    usuario_creacion character varying(10) NOT NULL,
    estado integer NOT NULL,
    fecha_creacion timestamp with time zone DEFAULT now(),
    fecha_modificacion timestamp with time zone DEFAULT now()
);
    DROP TABLE public.producto;
       public         heap    postgres    false    3            �            1259    24782    producto_id_seq    SEQUENCE     �   CREATE SEQUENCE public.producto_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.producto_id_seq;
       public          postgres    false    3    201            �           0    0    producto_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.producto_id_seq OWNED BY public.producto.id;
          public          postgres    false    200            �            1259    24818    stock_sucursal    TABLE     �   CREATE TABLE public.stock_sucursal (
    id integer NOT NULL,
    producto_id integer NOT NULL,
    sucursal_id integer NOT NULL,
    cantidad integer NOT NULL
);
 "   DROP TABLE public.stock_sucursal;
       public         heap    postgres    false    3            �            1259    24816    stock_sucursal_id_seq    SEQUENCE     �   CREATE SEQUENCE public.stock_sucursal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.stock_sucursal_id_seq;
       public          postgres    false    3    205            �           0    0    stock_sucursal_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.stock_sucursal_id_seq OWNED BY public.stock_sucursal.id;
          public          postgres    false    204            �            1259    24802    sucursal    TABLE     v  CREATE TABLE public.sucursal (
    id integer NOT NULL,
    codigo character varying(20),
    descripcion character varying(100),
    direccion character varying(200),
    usuario_creacion character varying(10) NOT NULL,
    estado integer NOT NULL,
    fecha_creacion timestamp with time zone DEFAULT now(),
    fecha_modificacion timestamp with time zone DEFAULT now()
);
    DROP TABLE public.sucursal;
       public         heap    postgres    false    3            �            1259    24800    sucursal_id_seq    SEQUENCE     �   CREATE SEQUENCE public.sucursal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.sucursal_id_seq;
       public          postgres    false    3    203            �           0    0    sucursal_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.sucursal_id_seq OWNED BY public.sucursal.id;
          public          postgres    false    202            .           2604    24787    producto id    DEFAULT     j   ALTER TABLE ONLY public.producto ALTER COLUMN id SET DEFAULT nextval('public.producto_id_seq'::regclass);
 :   ALTER TABLE public.producto ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    201    200    201            4           2604    24821    stock_sucursal id    DEFAULT     v   ALTER TABLE ONLY public.stock_sucursal ALTER COLUMN id SET DEFAULT nextval('public.stock_sucursal_id_seq'::regclass);
 @   ALTER TABLE public.stock_sucursal ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    204    205    205            1           2604    24805    sucursal id    DEFAULT     j   ALTER TABLE ONLY public.sucursal ALTER COLUMN id SET DEFAULT nextval('public.sucursal_id_seq'::regclass);
 :   ALTER TABLE public.sucursal ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    202    203    203            �          0    24784    producto 
   TABLE DATA           �   COPY public.producto (id, codigo, descripcion, marca, precio_compra, pvp, usuario_creacion, estado, fecha_creacion, fecha_modificacion) FROM stdin;
    public          postgres    false    201   Y!       �          0    24818    stock_sucursal 
   TABLE DATA           P   COPY public.stock_sucursal (id, producto_id, sucursal_id, cantidad) FROM stdin;
    public          postgres    false    205   �!       �          0    24802    sucursal 
   TABLE DATA           �   COPY public.sucursal (id, codigo, descripcion, direccion, usuario_creacion, estado, fecha_creacion, fecha_modificacion) FROM stdin;
    public          postgres    false    203   +"       �           0    0    producto_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.producto_id_seq', 12, true);
          public          postgres    false    200            �           0    0    stock_sucursal_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.stock_sucursal_id_seq', 8, true);
          public          postgres    false    204            �           0    0    sucursal_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.sucursal_id_seq', 8, true);
          public          postgres    false    202            6           2606    24791    producto producto_empresa_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_empresa_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.producto DROP CONSTRAINT producto_empresa_pkey;
       public            postgres    false    201            :           2606    24823    stock_sucursal stock_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.stock_sucursal
    ADD CONSTRAINT stock_pkey PRIMARY KEY (id);
 C   ALTER TABLE ONLY public.stock_sucursal DROP CONSTRAINT stock_pkey;
       public            postgres    false    205            8           2606    24809    sucursal sucursal_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT sucursal_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.sucursal DROP CONSTRAINT sucursal_pkey;
       public            postgres    false    203            ;           2606    24824 )   stock_sucursal stock_sucursal_producto_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.stock_sucursal
    ADD CONSTRAINT stock_sucursal_producto_fk FOREIGN KEY (producto_id) REFERENCES public.producto(id);
 S   ALTER TABLE ONLY public.stock_sucursal DROP CONSTRAINT stock_sucursal_producto_fk;
       public          postgres    false    205    2870    201            <           2606    24829 )   stock_sucursal stock_sucursal_sucursal_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.stock_sucursal
    ADD CONSTRAINT stock_sucursal_sucursal_fk FOREIGN KEY (sucursal_id) REFERENCES public.sucursal(id);
 S   ALTER TABLE ONLY public.stock_sucursal DROP CONSTRAINT stock_sucursal_sucursal_fk;
       public          postgres    false    203    2872    205            �   �   x�u�K
1�ur��@K�t�Cx��Tq�Ȁ�7E,6
��/M �8��s��L@Er٘7�����s���ןA!�@��*V%�5�Md��{��wĦ�H�RU�Zx��Y@U?x�[;.����Z��j����o�{D���@+      �   $   x�3�4�4�42�2�44 ��,@,�X� Ov      �   B   x�3�4��M,)ʬ�t�t�4�42��04�0�����!p��''�( {�8��cS���� �O�     