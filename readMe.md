A spring project setup with Annotations for Dependency Injection.

Annotation Injection is performed before XML, hence the latter overrides the former.
Annotation wiring is not enabled by default in the Spring container. So in order to use annotation, you need to enable it in a configuration file(Beans. xml in this project).
Once <context:annotation-config/> is configured, you can start annotating your code to indicate that Spring should automatically wire values into properties, methods, and constructors.

- When Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the method.

You can use @Autowired annotation on properties to get rid of the setter methods.

- @Resource annotation on fields or setter methods performs ByName autowiring.

- @Required annotation is to make properties mandatory. These properties need to be populated during configuration time itself. But this is currently deprecated, hence doesn't work anymore I suppose. Alternative @Autowired(required = true). If property is found to be empty, UnsatifiedDependencyException is thrown. 

- @Qualifier is used along with @Autowired to specify the name of the bean.

- @Resource, @PostConstruct(init-method alternative) & @PreDestroy(destroy-method alternative) are included under JSR-250 annotations.
