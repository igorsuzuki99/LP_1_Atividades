-- Table: public.carro

-- DROP TABLE public.carro;

CREATE TABLE public.carro
(
    id serial NOT NULL,
    placa character varying(10) COLLATE pg_catalog."default" NOT NULL,
    potencia character varying(10) COLLATE pg_catalog."default" NOT NULL,
    modelo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    cor character varying(20) COLLATE pg_catalog."default" NOT NULL,
    marca character varying(20) COLLATE pg_catalog."default" NOT NULL,
    ano character varying(10) COLLATE pg_catalog."default" NOT NULL,
    preco character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT carro_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.carro
    OWNER to postgres;

-- Table: public.fornecedor

-- DROP TABLE public.fornecedor;

CREATE TABLE public.fornecedor
(
	id serial NOT NULL,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    estado character varying(20) COLLATE pg_catalog."default" NOT NULL,
    cidade character varying(30) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    email character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT fornecedor_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.fornecedor
    OWNER to postgres;

-- Table: public.vendedor

-- DROP TABLE public.vendedor;

CREATE TABLE public.vendedor
(
	id serial NOT NULL,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    codigo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    email character varying(30) COLLATE pg_catalog."default" NOT NULL,
    salario character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT vendedor_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.vendedor
    OWNER to postgres;