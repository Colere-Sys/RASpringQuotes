--
-- PostgreSQL database dump
--

-- Dumped from database version 10.16
-- Dumped by pg_dump version 13.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

--
-- Name: Proverb; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE public."Proverb" (
    dateof character varying,
    source character varying,
    text character varying,
    id integer NOT NULL,
    genre character varying
);


ALTER TABLE public."Proverb" OWNER TO admin;

--
-- Name: User; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE public."User" (
    address character varying,
    age integer,
    firstname character varying,
    lastlogin character varying,
    lastname character varying,
    phone character varying,
    username character varying NOT NULL,
    email character varying
);


ALTER TABLE public."User" OWNER TO admin;

--
-- Name: UserProverb; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE public."UserProverb" (
    username character varying,
    "proverbId" character varying
);


ALTER TABLE public."UserProverb" OWNER TO admin;

--
-- Name: Proverb Proverb_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY public."Proverb"
    ADD CONSTRAINT "Proverb_pkey" PRIMARY KEY (id);


--
-- Name: User User_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "User_pkey" PRIMARY KEY (username);


--
-- PostgreSQL database dump complete
--

