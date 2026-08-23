const map = {
    get: <T extends HTMLElement>(id: string) => document.getElementById(id) as T,
    	test: () => map.get<HTMLHeadingElement>("test")
} as const;
export default map;